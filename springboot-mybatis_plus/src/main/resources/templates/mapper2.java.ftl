package ${package.Mapper};

import ${package.Entity}.${entity};
import ${superMapperClassPackage};

/**
 * @author ${author}
 * @Description
 */
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {

}
</#if>