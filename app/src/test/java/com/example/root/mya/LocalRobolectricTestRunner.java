package com.example.root.mya;


import org.junit.runners.model.InitializationError;
import org.robolectric.DefaultTestLifecycle;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.TestLifecycle;
import org.robolectric.internal.dependency.CachedDependencyResolver;
import org.robolectric.internal.dependency.DependencyResolver;
import org.robolectric.internal.dependency.MavenDependencyResolver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LocalRobolectricTestRunner extends RobolectricTestRunner {
    /**
     * Creates a runner to run {@code testClass}. Looks in your working directory for your AndroidManifest.xml file
     * and res directory by default. Use the {@link Config} annotation to configure.
     *
     * @param testClass the test class to be run
     * @throws InitializationError if junit says so
     */
    public LocalRobolectricTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);

        // Setting robolectric.offline which tells Robolectric to look for runtime dependency
        // JARs from a local directory and to not download them from Maven.
        System.setProperty("robolectric.offline", "true");
        System.setProperty("robolectric.dependency.dir","/home/zhangcx/Downloads");

        //Setting true to enable debug logging
        //System.setProperty("robolectric.logging.enabled","true");

    }

    /**
     * download dependency jar from ali-cloud at runtime
     * comment robolectric.offline setting
     */
//    @Override
//    protected DependencyResolver getJarResolver() {
//        DependencyResolver resolver = super.getJarResolver();
//
//        if (resolver instanceof CachedDependencyResolver) {
//            CachedDependencyResolver cachedDR = (CachedDependencyResolver) resolver;
//
//            try {
//                Field drField = CachedDependencyResolver.class.getDeclaredField("dependencyResolver");
//                drField.setAccessible(true);
//
//                // 替换CachedDependencyResolver里的dependencyResolver为自定义MavenDependencyResolver
//                drField.set(cachedDR, new MavenDependencyResolver("http://maven.aliyun.com/nexus/content/groups/public/", "alimaven"));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        return resolver;
//    }

}
