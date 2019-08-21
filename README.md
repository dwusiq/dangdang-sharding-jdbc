# sharding sphere 系列实践

## 子服务

| 子服务名称 | 描述    |
|------|-------------|
| sharding-table   | 分表不分库     |
| sharding-database   | 分库不分表  |
| sharding-db-table   | 分库分表    |


## 子服务运行
  * 将子服务导入到开发工具（IDEA或其他）
  * 使用script的脚本创建表格
  * 更改application.yml的数据库信息
  * 最后直接运行test类
   
 ## 注意
  这只是最简单地实现了功能，如果在生产环境使用需要更深入的研究配置