package bridge;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        int birdgeSize = getBridgeSize();
        List<String> bridge = getBridge(birdgeSize);
        System.out.println("bridge : " + bridge);
        String move = getMoving();
        System.out.println("move:" + move);


    }

    public static int getBridgeSize() {
        OutputView.startGame();
        OutputView.getBridgeSize();

        InputView inputView = new InputView();
        return inputView.readBridgeSize();
    }

    public static List<String> getBridge(int bridgeSize) {
        BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
        List<String> bridge = bridgeMaker.makeBridge(bridgeSize);
        return bridge;
    }

    public static String getMoving() {
        String answer = "";
        while (!(answer.equals("U")||answer.equals("D"))) {
            OutputView.getMove();
            answer = InputView.readMoving();
        }
        return answer;
    }
}
