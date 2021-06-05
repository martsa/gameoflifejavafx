package guru.springframework.services;


import guru.springframework.api.domain.User;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServicesImplTest{

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
        List<User> user=apiService.getUsers(limit:3);
        assertEquals(3,user.size());
    }
}