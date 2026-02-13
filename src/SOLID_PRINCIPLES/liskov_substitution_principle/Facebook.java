package SOLID_PRINCIPLES.liskov_substitution_principle;

/**
 * As all the functionality of the child class is substitute of the parent class
 * We can replace the parent with the child without interrupting the behavior
 * of the program
 */
public class Facebook extends SocialMedia {

    public void chatWithFriend() {

    }

    public void publishPost(Object post) {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}
