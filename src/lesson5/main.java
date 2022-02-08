package lesson5;

public class main {
    public static void main(String[] args) {
        Employer[] employerArray = new Employer[5];
        employerArray[0] = new Employer("Ivanov Ivan", "Java Developer", "1@mail.ru", "89211111", 43000, 21);
        employerArray[1] = new Employer("Petrov Petr", "Teamlead", "2@mail.ru", "89212222", 86000, 26);
        employerArray[2] = new Employer("Sidorov Sidr", "QA-Engineer", "3@mail.ru", "89213333", 57000, 41);
        employerArray[3] = new Employer("Danilov Daniil", "Java Developer", "4@mail.ru", "89214344", 41000, 19);
        employerArray[4] = new Employer("Dmitriev Dmitriy", "QA-Engineer", "5@mail.ru", "89215555", 55000, 49);

        for (int i = 0; i < employerArray.length; i++) {
            if (employerArray[i].getAge() > 40) {
                employerArray[i].print();
            }
        }
    }
}
