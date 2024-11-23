# redis-complete
redis integration with spring boot application

=> Cache is a temporary storage

=> Cache will represent data in key-value format

=> By using Cache data, we can reduce no.of db calls from our application.

Note: DB call is always costly (it will take more time to execute)

=> By using Cache data (Cache Memory) we can increase performance of the application.

# Redis Cache is one of the most famous Cache available in Market #

=> The open source, in-memory data store used by millions of developers as a database, cache, streaming engine, and message broker.


=> Spring Boot provided below starter to communicate with Redis Server

				### springboot-starter-redis ###

=> We will use below components to communicate with Redis Server


1) JedisConnectionFactory : It represents connection with Redis Server

2) RedisTemplate : It provides methods to perform operations with Redis Server

3) OpsForHash: It is providing methods to peform operations based on Hash key


put (...)

get(..)

entries (.)

deleet(..)
