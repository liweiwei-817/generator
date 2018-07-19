import org.mybatis.generator.api.ShellRunner;

/**
 * 执行类
 */
public class MybatisGeneratorApp {

    public static void main(String[] args) {

        args = new String[]{ "-configfile", "src/main/resources/generator.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
