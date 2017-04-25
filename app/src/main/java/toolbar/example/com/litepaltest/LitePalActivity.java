package toolbar.example.com.litepaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;

public class LitePalActivity extends AppCompatActivity {
      Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lite_pal);
        btn = (Button)findViewById(R.id.table);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LitePal.getDatabase() ;//创建数据库
                /***
                 * 向数据库中添加数据
                 * 1 创建 数据库中对应的字段对应的类的对象
                 *   Book book = new Book();
                 * 2 设置对应的属性的值
                 *   book.setName()......
                 * 3 调用save()进行保存
                 */
                Book book = new Book();
                book.setAuthor("xiaohei");
                book.setName("this is frist code");
                book.setPages(123);
                book.setPrice(45.12);
                book.save();
                /**方式一
                 * 先进行和保存相同的操作
                 * 设置先要修改的数据
                 * 调用save()保存
                 */
                /**
                 * 方式二
                 * 1 创建javaBean的对象
                 * 2 修改要更新的属性
                 * 3 调用update方法通过给没设置值的属性的这确定修改的数据列
                 *
                 */
                /***
                 * 删除数据
                 * 调用deleteAll(javaBean的名称，"设置条件","条件的值")

                 */
                /***
                 * 查询
                 * 调用对应的方法
                 *  findall(javaBean名称)返回数据集合
                 *  findFrist(javaBean名称)
                 *  select(内部设置查询的列).find(javaBean名称)
                 *  order(指定排序方式的参数)
                 *  limit(int number)限制返回的数据的数量
                 *  findBySql(String Sql)
                 */
            }
        });
    }
}
