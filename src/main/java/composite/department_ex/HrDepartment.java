package composite.department_ex;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HrDepartment implements Department {
	@Override
	public void printDepartmentName() {
		log.info(getClass().getSimpleName());
	}
}
