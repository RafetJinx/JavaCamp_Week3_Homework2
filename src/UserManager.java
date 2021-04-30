public class UserManager extends User {

    public void viewUser(User user){
        System.out.println("Kullanici Id:    " + user.getId());
        System.out.println("Kullanici Ad:    " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Kullanici Mail:  " + user.getEmail());
        System.out.println("Kullanici Sifre: " + user.getPassword());
    }

    public void viewMultipleUser(User[] users){
        for(User user : users){
            System.out.println("Kullanici Id: " + user.getId());
            System.out.println("Kullanici Ad: " + user.getFirstName() + user.getLastName());
            System.out.println("Kullanici Mail: " + user.getEmail());
            System.out.println("Kullanici Şifre " + user.getPassword());
        }
    }

    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici eklendi");
    }

    public void addMultiple(User[] users){
        for(User user : users){
            System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici eklendi");
        }
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici silindi");
    }

    public void deleteMultiple(User[] users) {
        for(User user : users){
            System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanici silindi");
        }
    }

    public void logIn(User user) {
        int girisHakki = 3;
        String email;
        String password;
        System.out.println(user.getFirstName() + " " + user.getLastName() +
                " giris yapmak icin hesap bilgilerinizi giriniz");
        while(girisHakki > 0){
            System.out.print("Mailinizi giriniz: ");
            email = user.scanner.nextLine();
            System.out.print("Sifrenizi giriniz: ");
            password = user.scanner.nextLine();
            System.out.println();
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Giris basarili " + user.getFirstName() + " " + user.getLastName() +
                        "\nAnasayfaya yonlendiriliyorsunuz\n");
                break;
            } else {
                girisHakki--;
                if(girisHakki > 0){
                    System.out.println("Girilen kullanici bilgileri hatali tekrar giris yapmayi deneyiniz");
                    System.out.println("Kalan giriş hakki sayiniz: " + girisHakki + "\n");
                } else {
                    System.out.println("Giris denemeleri basarisiz. Lütfen daha sonra tekar deneyiniz\n");
                }
            }
        }
    }

    public void logOut(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli ve " +
                user.getEmail() + " email sahibi kullanici cikis yapti");
        System.out.println("Anasayfaya yonlendiriliyorsunuz\n");
    }
}
