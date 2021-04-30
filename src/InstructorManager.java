public class InstructorManager extends UserManager {
    @Override
    public void viewUser(User user){
        System.out.println("Egitmen Id:    " + user.getId());
        System.out.println("Egitmen Ad:    " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Egitmen Mail:  " + user.getEmail());
        System.out.println("Egitmen Sifre: " + user.getPassword());
    }

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli egitmen eklendi");
    }

    @Override
    public void addMultiple(User[] users){
        for(User user : users){
            System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli egitmen eklendi");
        }
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli egitmen silindi");
    }

    @Override
    public void deleteMultiple(User[] users) {
        for(User user : users){
            System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli egitmen silindi");
        }
    }
}
