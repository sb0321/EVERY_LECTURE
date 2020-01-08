package com.goldenbrothers.everylecture.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	
	// UUID 반환
	public String getUUID() {
		
		
		UUID uid = UUID.randomUUID();
		
		return uid.toString();
	}
	
	public String saveImage(MultipartFile file, HttpServletRequest request) {
		
		// 사전 준비
		String originalFileName = file.getOriginalFilename();
		String uid = getUUID();
		
		// 잘 되었는지 확인
		String result = "";
		
		
		try {
			// 파일 내용
			byte[] fileContent = file.getBytes();
			
			String path = "/resources/lecture/";
			String result_path = request.getContextPath().concat(path);
//			path = ("/everylecture/resources/video/").concat(path);
//			path = ("C:/EVERY-LECTURE-FILES").concat(path);
			path = request.getSession().getServletContext().getRealPath(path);
			
			// 디렉토리 여부 확인 후 없으면 생성
			File uploadDir = new File(path);
			if(!uploadDir.exists()) {
				uploadDir.mkdirs();
			}
			
			// 파일 고유이름을 UUID로 전환 및 추가
			String fileName = originalFileName
					.substring(originalFileName.lastIndexOf("."), originalFileName.length());
			
			// 변경된 파일 이름
			String convertName = uid + fileName;
			
			// 파일 쓰기
			File f = new File(path.concat("/").concat(convertName));
			OutputStream out = new FileOutputStream(f);
			out.write(fileContent);
			out.close();
			
			// 확인 변경
			result = result_path.concat(convertName);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int deleteImage(String filePath, HttpServletRequest request) {
		
//		String path = "/resources/lecture/";
//		String result_path = request.getContextPath().concat(path);
//		path = request.getSession().getServletContext().getRealPath(path);
		
		// 사전 준비
		filePath = filePath.substring(filePath.lastIndexOf("/"), filePath.length());
		
		String path = "/resources/lecture/";
		path = request.getSession().getServletContext().getRealPath(path).concat(filePath);
		
		System.out.println(path);
		
		int result = 0;
		
		try {
			
			File file = new File(path);
			
			if(file.delete()) {
				result = 1;
			}
			else {
				result = -1;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return result;
	}

}
