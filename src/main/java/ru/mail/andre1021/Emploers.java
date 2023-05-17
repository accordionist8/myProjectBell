package ru.mail.andre1021;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Emploers {
    private final String name = "Имя";
    private final String age = "Возраст";
    private final String position = "Должность";
    private final String zp = "Зарплата";
    private List<Map<String, String>> listEmploers;

    public Emploers() {
        listEmploers = new ArrayList<>();
        Map<String, String> emp_1 = new TreeMap<>();
        emp_1.put(name, "Кирилл");
        emp_1.put(age, "26");
        emp_1.put(position, "Middle java dev");
        emp_1.put(zp, "150000 руб");

        listEmploers.add(emp_1);

        Map<String, String> emp_2 = new TreeMap<>();
        emp_2.put(name, "Виталий");
        emp_2.put(age, "28");
        emp_2.put(position, "Senior java automation QA");
        emp_2.put(zp, "2000$");

        listEmploers.add(emp_2);

        Map<String, String> emp_3 = new TreeMap<>();
        emp_3.put(name, "Александр");
        emp_3.put(age, "31");
        emp_3.put(position, "junior functional tester");
        emp_3.put(zp, "50000 руб");

        listEmploers.add(emp_3);

        Map<String, String> emp_4 = new TreeMap<>();
        emp_4.put(name, "Дементий");
        emp_4.put(age, "35");
        emp_4.put(position, "dev-ops");
        emp_4.put(zp, "1500$");

        listEmploers.add(emp_4);

    }

    public List getNameByAge(int i) {
        List result = new ArrayList(5);

        for (Map<String, String> tmp : listEmploers) {
            if (Integer.parseInt(tmp.get(age)) < i) {
                result.add(tmp.get(name));
            }
        }
        return result;
    }

    public List<Map<String, String>> getListEmploers() {
        return listEmploers;
    }

    public List getNameByZP(String zp) {
        List result = new ArrayList();
        for (Map<String, String> tmp : listEmploers) {
            if (tmp.get(this.zp).contains(zp)) {
                result.add(tmp.get(name));
            }
        }
        return result;
    }

    public int getMidleAge() {
        int result = 0;

        for (Map<String, String> tmp : listEmploers){
            result += Integer.parseInt(tmp.get(age));
        }
        return result / listEmploers.size();
    }
}
