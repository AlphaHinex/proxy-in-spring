package io.github.alphahinex.proxyinspring

import io.github.springroll.test.AbstractSpringTest
import org.junit.Ignore
import org.junit.Test
import org.springframework.http.HttpStatus
import sun.misc.ProxyGenerator

import java.lang.reflect.UndeclaredThrowableException

class ProxyTest extends AbstractSpringTest {

    @Test
    void checkClass() {
        def res = resOfPost('/class', '', HttpStatus.INTERNAL_SERVER_ERROR)
        assert res.ex == UndeclaredThrowableException.toString()
    }

    @Test
    void checkClassWithThrows() {
        def res = resOfPost('/class/throws', '', HttpStatus.INTERNAL_SERVER_ERROR)
        assert res.ex == CheckedException.toString()
    }

    @Test
    void checkInterface() {
        def res = resOfPost('/interface', '', HttpStatus.INTERNAL_SERVER_ERROR)
        assert res.ex == UndeclaredThrowableException.toString()
    }

    @Test
    void checkInterfaceWithThrows() {
        def res = resOfPost('/interface/throws', '', HttpStatus.INTERNAL_SERVER_ERROR)
        assert res.ex == CheckedException.toString()
    }

    @Ignore
    @Test
    void test() {
        Class[] classes = [InterfaceOfController]
        byte[] bytes = ProxyGenerator.generateProxyClass('$proxy3', classes)
        assert bytes != null
        new FileOutputStream(new File('/Users/alphahinex/Desktop/Test.class')).write(bytes)
    }

}
