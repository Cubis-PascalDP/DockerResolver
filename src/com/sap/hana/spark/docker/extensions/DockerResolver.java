package com.sap.hana.spark.docker.extensions;

import com.sap.hana.spark.extensions.IPResolver;
import org.apache.spark.Logging;
import org.apache.spark.Logging$class;
import scala.Function0;
import scala.runtime.AbstractFunction0;
import org.slf4j.Logger;

import scala.reflect.ScalaSignature;

import java.util.Map;

@ScalaSignature(bytes="\006\001)3A!\001\002\001\037\tY\021iV*SKN|GN^3s\025\t\031A!\001\006fqR,gn]5p]NT!!\002\004\002\007\005<8O\003\002\b\021\005)1\017]1sW*\021\021BC\001\005Q\006t\027M\003\002\f\031\005\0311/\0319\013\0035\t1aY8n\007\001\031B\001\001\t\0277A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032\004\"aF\r\016\003aQ!a\001\004\n\005iA\"AC%Q%\026\034x\016\034<feB\021ADI\007\002;)\021qA\b\006\003?\001\na!\0319bG\",'\"A\021\002\007=\024x-\003\002$;\t9Aj\\4hS:<\007\"B\023\001\t\0031\023A\002\037j]&$h\bF\001(!\tA\003!D\001\003\021\035Q\003A1A\005\n-\n1\002\025*J-\006#ViX+S\031V\tA\006\005\002.e5\taF\003\0020a\005!A.\0318h\025\005\t\024\001\0026bm\006L!a\r\030\003\rM#(/\0338h\021\031)\004\001)A\005Y\005a\001KU%W\003R+u,\026*MA!9q\007\001b\001\n\023Y\023A\003)V\0052K5iX+S\031\"1\021\b\001Q\001\n1\n1\002U+C\031&\033u,\026*MA!)1\b\001C!y\005q!/Z:pYZ,\027\t\0323sKN\034HCA\037D!\tq\024I\004\002\022%\021\001IE\001\007!J,G-\0324\n\005M\022%B\001!\023\021\025!%\b1\001>\003\tI\007\017C\003G\001\021\005q)A\002hKR$\"!\020%\t\013%+\005\031A\037\002\007U\024H\016")


/**
 * Created by Pascal De Poorter on 3/08/2016.
 */
public class DockerResolver implements IPResolver, Logging {

    private transient Logger org$apache$spark$Logging$$log_;

    public Logger org$apache$spark$Logging$$log_()
    {
        return this.org$apache$spark$Logging$$log_;
    }

    public void org$apache$spark$Logging$$log__$eq(Logger x$1)
    {
        this.org$apache$spark$Logging$$log_ = x$1;
    }

    public Logger log()
    {
        return Logging$class.log(this);
    }

    public String logName() {
        return Logging$class.logName(this);
    }

    public void logInfo(Function0<String> msg, Throwable throwable)
    {
        Logging$class.logInfo(this, msg, throwable);
    }

    public void logWarning(Function0<String> msg, Throwable throwable)
    {
        Logging$class.logWarning(this, msg, throwable);
    }

    public void logDebug(Function0<String> msg, Throwable throwable)
    {
        Logging$class.logDebug(this, msg, throwable);
    }

    public void logTrace(Function0<String> msg, Throwable throwable)
    {
        Logging$class.logTrace(this, msg, throwable);
    }

    public void logError(Function0<String> msg, Throwable throwable)
    {
        Logging$class.logError(this, msg, throwable);
    }

    public void logInfo(Function0<String> msg)
    {
        Logging$class.logInfo(this, msg);
    }

    public void logWarning(Function0<String> msg)
    {
        Logging$class.logWarning(this, msg);
    }

    public void logDebug(Function0<String> msg)
    {
        Logging$class.logDebug(this, msg);
    }

    public void logTrace(Function0<String> msg)
    {
        Logging$class.logTrace(this, msg);
    }

    public void logError(Function0<String> msg)
    {
        Logging$class.logError(this, msg);
    }

    public boolean isTraceEnabled()
    {
        return Logging$class.isTraceEnabled(this);
    }

    public String resolveAddress(String ip)
    {

        Map<String, String> envVariables = System.getenv();

        envVariables.forEach((envVarName, envVarValue) -> logInfo(new AbstractFunction0() {
            @Override
            public String apply() {
                return envVarName + ": " + envVarValue;
            }
        }));

        logInfo(new AbstractFunction0()
        {
            public final String apply()
            {
                return "Inside AWS Translation" + envVariables.get("vpnip");
            }
        });
        return envVariables.get("vpnip");
    }

    public DockerResolver()
    {
    }
}
