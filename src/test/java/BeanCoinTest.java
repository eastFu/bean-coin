import org.junit.Test;
import pers.east.coin.block.Block;

/**
 * @author East.F
 * @ClassName: BeanCoinTest
 * @Description: TODO
 * @date 2019/7/9 17:28
 */
public class BeanCoinTest {

    @Test
    private void test1(){
        Block genesisBlock = new Block("Hi im the first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);
    }

}
