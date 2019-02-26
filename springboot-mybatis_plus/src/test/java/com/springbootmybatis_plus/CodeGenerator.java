package com.springbootmybatis_plus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

/**
 * MyBatis-Plus 的代码生成器，自动生成Entity、Mapper、Mapper XML、Service、Controller模块代码。
 * 具体参数配置，参考：
 *                      https://mp.baomidou.com/guide/generator.html
 *                      https://mp.baomidou.com/config/generator-config.html
 */

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {
    private static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入" + tip + "：");
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath + "/springboot-mybatis_plus/src/main/java");
        globalConfig.setAuthor("ZzzLJ");

        //globalConfig.setSwagger2(true);
        globalConfig.setBaseResultMap(true);

        globalConfig.setOpen(true);
        autoGenerator.setGlobalConfig(globalConfig);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/integratedsystem?useSSL=false&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("toor");
        autoGenerator.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //父包模块名
        pc.setModuleName(scanner("模块名"));
        //父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
        pc.setParent("com.wyu");
        autoGenerator.setPackageInfo(pc);

        /*
        * 配置自定义属性注入
        * 自定义属性注入:abc
        * 在.ftl(或者是.vm)模板中，通过${cfg.abc}获取属性
        */
        InjectionConfig injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                map.put("customController", this.getConfig().getGlobalConfig().getAuthor() + "-Controller");
                map.put("customIService", this.getConfig().getGlobalConfig().getAuthor() + "-IService");
                map.put("customMapper", this.getConfig().getGlobalConfig().getAuthor() + "-Mapper");
                map.put("customMapper XML", this.getConfig().getGlobalConfig().getAuthor() + "-Mapper XML");
                map.put("customEntity", this.getConfig().getGlobalConfig().getAuthor() + "-Entity");
                this.setMap(map);
            }
        };
        autoGenerator.setCfg(injectionConfig);

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper2.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 调整 xml 生成目录演示
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/springboot-mybatis_plus/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        injectionConfig.setFileOutConfigList(focList);
        autoGenerator.setCfg(injectionConfig);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        // 指定自定义模板路径, 位置：/resources/templates/entity2.java.ftl(或者是.vm)
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        templateConfig.setEntity("/templates/entity2.java");
        templateConfig.setService("/templates/service2.java");
        templateConfig.setController("/templates/controller2.java");
        templateConfig.setServiceImpl("/templates/serviceImpl2.java");
        templateConfig.setEntityKt("/templates/entity2.kt");
        templateConfig.setMapper("/templates/mapper2.java");
        templateConfig.setXml("/templates/mapper2.xml");
        autoGenerator.setTemplate(templateConfig);

        // 数据库表配置，通过该配置，可指定需要生成哪些表或者排除哪些表
        StrategyConfig strategy = new StrategyConfig();
        //数据库表映射到实体的命名策略-驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库表字段映射到实体的命名策略-驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);

        //自定义继承的Entity类、Mapper类、Service类、ServiceImpl类、Controller类全称，带包名
        //strategy.setSuperEntityClass("com.mybatis_plus.wyu.common.BaseEntity");
        //strategy.setSuperMapperClass();
        //strategy.setSuperControllerClass("com.mybatis_plus.wyu.common.BaseController");
        //自定义基础的Entity类，公共字段
        //strategy.setSuperEntityColumns("id");

        String[] tables = new String[]{
                "sys_department","sys_grade"
        };
        //需要包含的表名，允许正则表达式
        //strategy.setInclude("sys_*");
        strategy.setInclude(tables);
        //需要排除的表名，允许正则表达式
        strategy.setExclude();

        //是否为lombok模型
        strategy.setEntityLombokModel(true);
        //生成 @RestController 控制器
        strategy.setRestControllerStyle(false);
        //驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);
        //表前缀
        strategy.setTablePrefix(pc.getModuleName() + "_");



        autoGenerator.setStrategy(strategy);

        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
        autoGenerator.execute();
    }

}
