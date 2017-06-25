import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import model.User;

import java.util.ArrayList;

/**
 * Created by KBolelyy on 19.05.2017.
 */
public class TestUser extends Assert {

    private UserServiceImpl userService = new UserServiceImpl();

    private ArrayList<User> users = new ArrayList<User>();


   /* @Before
    public void initializeUsers() {
        users.add(new User("A", "A@mail.com", "Человек1", "Человекович1"));
        users.add(new User("B", "B@mail.com", "Человек2", "Человекович2"));
        users.add(new User("C", "C@mail.com", "Человек3", "Человекович3"));
    }



    @Test
    public void TestCreateUser() {
        ArrayList<User> usersTest = new ArrayList<User>();
        User user = userService.createUser("A", "A@mail.com", "Человек1", "Человекович1");
        usersTest.add(user);
        user = userService.createUser("B", "B@mail.com", "Человек2", "Человекович2");
        usersTest.add(user);

        Assert.assertNotNull("Must be not null", usersTest);
        Assert.assertEquals("Size must be 2", usersTest.size(), 2);

    }*/



}
