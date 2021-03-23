Hello
=

```bash
/opt/spark/sbin/start-master.sh
```

```bash
/opt/spark/bin/spark-submit --class com.example.App --master spark://localhost:7077 --deploy-mode cluster build/libs/hello-spark-java.jar
```