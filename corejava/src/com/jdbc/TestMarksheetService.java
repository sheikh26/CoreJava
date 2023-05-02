package com.jdbc;

import com.dto.MarksheetDTO;

public class TestMarksheetService {

	public static void main(String[] args)throws Exception {
		
		
		MarksheetDTO dto = new MarksheetDTO();
		dto.setRollNo("ABC123");
		dto.setName("Salman Khan");
		dto.setMaths(99);
		dto.setChemistry(99);
		dto.setPhysics(99);
		
		MarksheetService service = new MarksheetService();
		service.addMarkSheet(dto);
		

	}

}
