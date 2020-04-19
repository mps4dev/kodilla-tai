package pl.mps.kodilla.intro;

public class Users {

    public static void main(String[] args) {
        User[] users = initUsers();
        printUserNamesWithAgeUnder(users, getAverageAge(users));
    }

    private static User[] initUsers() {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        return new User[] {anna, betty, carl, david, eva, frankie};
    }

    private static double getAverageAge(User[] users) {
        if (users == null) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        return sum / users.length;
    }

    private static void printUserNamesWithAgeUnder(User[] users, double age) {
        for (User user : users) {
            if (user.getAge() < age) {
                System.out.println(user.getName());
            }
        }
    }
}
