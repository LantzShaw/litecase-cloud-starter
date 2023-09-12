# litecase cloud nacos

### 微服务
1. 商品服务 - mysql
2. 会员服务 - mysql
3. 积分服务 - mysql
4. 库存服务 - mysql
5. 交易服务 - mysql
6. 仓储服务 - mysql
7. 日志服务 - mysql
### Record

**[INFO] Invalid task '.test.skip=true': you must specify a valid lifecycle phase, or a goal in the format plugin:goal or pluginGroupId:pluginArtifactId :pluginVersion:goal**

```text
# 需要加`
mvn `-Dmaven.test.skip=true install
```
