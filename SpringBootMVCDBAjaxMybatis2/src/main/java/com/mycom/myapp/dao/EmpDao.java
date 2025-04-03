package com.mycom.myapp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.mycom.myapp.dto.EmpDto;

// mapper와 연결될 dao 인터페이스. mapper에서 구현

@Mapper
public interface EmpDao {
	
	// emp-mapper.xml에 대응
	List<EmpDto> listEmp();
	EmpDto detailEmp(int employeeId);
	int insertEmp(EmpDto empDto);
	int updateEmp(EmpDto empDto);
	int deleteEmp(int employeeId);
	
	// emp-mapper-2.xml에 대응
	List<EmpDto> listEmpLike(String searchWord);
	List<EmpDto> listEmpMap();
//	List<EmpDto> listEmpWhereIf(EmpDto empDto); // Map<String, String> map
	List<EmpDto> listEmpWhereIf(Map<String, String> map);
	
}
