import com.github.link89.Application;
import com.github.link89.domain.User;
import com.github.link89.domain.UserExample;
import com.github.link89.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class MybatisTest{
    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        User user = new User();
        user.setAge(20);
        user.setName("AAA");

        UserExample example = new UserExample();
        example.createCriteria()
                .andNameEqualTo(user.getName());
        List<User> users = userMapper.selectByExample(example);

        Assert.assertFalse(CollectionUtils.isEmpty(users));
        Assert.assertEquals(user.getAge(), users.get(0).getAge());


    }
}