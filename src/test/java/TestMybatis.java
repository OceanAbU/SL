import com.qiudaozhang.mapper.DataDictionaryMapper;
import com.qiudaozhang.model.DataDictionary;
import com.qiudaozhang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/10/7
 */
@Test
public class TestMybatis {



    public void find(){

        SqlSession sqlSession = MybatisUtil.createSqlSession();
        DataDictionaryMapper mapper = sqlSession.getMapper(DataDictionaryMapper.class);
        List<DataDictionary> cart_type = mapper.findByTypeCode("CART_TYPE");
        System.out.println(cart_type);
    }

}
