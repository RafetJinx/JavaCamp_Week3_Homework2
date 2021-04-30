public class StudentManager extends UserManager{
    @Override
    public void viewUser(User user){
        System.out.println("Ogrenci Id:    " + user.getId());
        System.out.println("Ogrenci Ad:    " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Ogrenci Mail:  " + user.getEmail());
        System.out.println("Ogrenci Sifre: " + user.getPassword());
    }

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli ogrenci eklendi");
    }

    @Override
    public void addMultiple(User[] users){
        for(User user : users){
            System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli ogrenci eklendi");
        }
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli ogrenci silindi");
    }

    @Override
    public void deleteMultiple(User[] users) {
        for(User user : users){
            System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli ogrenci silindi");
        }
    }
}
