package com.github.lithualien.webseosecurity.controller;

import com.github.lithualien.webseosecurity.dao.*;
import com.github.lithualien.webseosecurity.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

//@RestController
//@RequestMapping("/test")
public class TestController {

//    private CompanyDAO companyDAO;
//    private EmployeeDAO employeeDAO;
//    private HolidayDAO holidayDao;
//    private DismissalDAO dismissalDAO;
//    private RankDAO rankDAO;
//    private WorkingHourDAO workingHourDAO;
//
//    @GetMapping("/companies")
//    public List<Company> companies() {
//        return companyDAO.all();
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> employees() {
//        return employeeDAO.all();
//    }
//
//    @GetMapping("/employees/holidays")
//    public List<Holiday> employeeHolidays() {
//        return holidayDao.all();
//    }
//
//    @GetMapping("/employees/{employeeId}/working-hours")
//    public List<WorkableDay> employeeWorkingHours(
//            @PathVariable(value = "employeeId") int employeeId) {
//        return workingHourDAO.show(employeeId);
//    }
//
//    @GetMapping("/employees/dismissals")
//    public List<Dismissal> employeeDismissals() {
//        return dismissalDAO.all();
//    }
//
//    @GetMapping("/companies/{companyId}/positions")
//    public List<Rank> ranks(@PathVariable(value = "companyId") int companyId) {
//        return rankDAO.show(companyId);
//    }
//
//    @Autowired
//    public void setCompanyDAO(CompanyDAO companyDAO) {
//        this.companyDAO = companyDAO;
//    }
//
//    @Autowired
//    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
//        this.employeeDAO = employeeDAO;
//    }
//
//    @Autowired
//    public void setHolidayDao(HolidayDAO holidayDao) {
//        this.holidayDao = holidayDao;
//    }
//
//    @Autowired
//    public void setDismissalDAO(DismissalDAO dismissalDAO) {
//        this.dismissalDAO = dismissalDAO;
//    }
//
//    @Autowired
//    public void setRankDAO(RankDAO rankDAO) {
//        this.rankDAO = rankDAO;
//    }
//
//    @Autowired
//    public void setWorkingHourDAO(WorkingHourDAO workingHourDAO) {
//        this.workingHourDAO = workingHourDAO;
//    }
}
