# Apache Karaf Essentials - Service Component Runtime

Source code to our AKE Declarative Services video.

Build:

```text
mvn clean install
```

Deploy in Apache Karaf 4.4.6:

```text
feature:install scr
install -s mvn:com.savoir.apache.karaf.essentials.scr/api
install -s mvn:com.savoir.apache.karaf.essentials.scr/provider
install -s mvn:com.savoir.apache.karaf.essentials.scr/consumer
```


