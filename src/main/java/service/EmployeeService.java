package service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service

public class EmployeeService {

//public class PersonServiceImpl implements PersonService {
//    List<Person> persons = List.of(
//    )
//}

public String addEmployee() {
return "дописать код добавления персонала";
}

public String removeEmployee() {
    return "дописать код удаления человека";
}

public String findEmployee() {
    return "дописать код поиска человека";
}

}
