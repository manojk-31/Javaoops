import java.util.Optional;

interface UserService {
   
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {

    @Override
    public Optional<String> getUser(String name) {
        return (name == null || name.isBlank()) ? Optional.empty() : Optional.of(name);
    }

    public String generateWelcomeMessage(String name) {
        return getUser(name)
                .map(userName -> "Welcome, " + userName + "!")
                .orElse(getWelcomeMessage());
    }
}

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        System.out.println(userService.generateWelcomeMessage("Alice")); // Welcome, Alice!
        System.out.println(userService.generateWelcomeMessage(null));    // Welcome, Guest!
        System.out.println(userService.generateWelcomeMessage(""));      // Welcome, Guest!
    }
}