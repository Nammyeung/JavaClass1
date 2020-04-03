package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class New_employee {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int testCycle = Integer.parseInt(br.readLine());
        System.out.printf("테스트케이스의 개수 : %d",testCycle);
        for (int i = 0 ; i < testCycle ; i++) {
            List<Employee> employeeList = inputSortedEmployees(); // inputSortedEmployees 메소드를 통해서 리스트를 입력한다.
            System.out.println(solve(employeeList));
        }
    }

    private static int solve(List<Employee> employeeList) {
        int cnt = 0;
        int minInterViewRank = Integer.MAX_VALUE;

        for (Employee employee : employeeList) {
            if (employee.interviewRank < minInterViewRank) {
                cnt++;
                minInterViewRank = employee.interviewRank;
            }
        }
        return cnt;
    }

    private static List<Employee> inputSortedEmployees() throws IOException {
        int num = Integer.parseInt(br.readLine()); // 몇 명의 데이터를 받는지 결정
        List<Employee> employeeList = new ArrayList<>();
        for (int j = 0; j < num; j++) {// 데이터를 받는 인원까지 for문을 돌리고
            String[] rankInput = br.readLine().split(" "); // 데이터를 나누는 부분, split구문을 기준으로 두 데이터를 배열에 담고
            employeeList.add(new Employee(Integer.parseInt(rankInput[0]), Integer.parseInt(rankInput[1]))); // 데이터의 첫 번째 ,두 번째 부분을 객체로 받아서 추가시킨다.
        }
        Collections.sort(employeeList);
        return employeeList;
    }


    static class Employee implements Comparable<Employee>{
        int documentRank;
        int interviewRank;

        public Employee(int documentRank, int interviewRank) {
            this.documentRank = documentRank;
            this.interviewRank = interviewRank;
        }

        @Override
        public int compareTo(Employee employee) {
            return this.documentRank - employee.documentRank;
        }
    }
}