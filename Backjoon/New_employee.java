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
        System.out.printf("�׽�Ʈ���̽��� ���� : %d",testCycle);
        for (int i = 0 ; i < testCycle ; i++) {
            List<Employee> employeeList = inputSortedEmployees(); // inputSortedEmployees �޼ҵ带 ���ؼ� ����Ʈ�� �Է��Ѵ�.
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
        int num = Integer.parseInt(br.readLine()); // �� ���� �����͸� �޴��� ����
        List<Employee> employeeList = new ArrayList<>();
        for (int j = 0; j < num; j++) {// �����͸� �޴� �ο����� for���� ������
            String[] rankInput = br.readLine().split(" "); // �����͸� ������ �κ�, split������ �������� �� �����͸� �迭�� ���
            employeeList.add(new Employee(Integer.parseInt(rankInput[0]), Integer.parseInt(rankInput[1]))); // �������� ù ��° ,�� ��° �κ��� ��ü�� �޾Ƽ� �߰���Ų��.
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