import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import model.User;
import org.junit.Assert;
import org.junit.Test;

public class UserDaoTest extends Assert {

    @Test
    public void TestUserDao() {

        UserDao dao = new UserDao();

        // Add new user
        User user = new User();
        user.setFirstName("Daniel1");
        user.setLastName("NikoJdbc1");
        user.setPassword("12346");
        user.setEmail("daniel1@example.com");
        user.setLogin("MrSasf12");
        try {
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse("1983-02-03");
            user.setCreateDate(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //

    }

}