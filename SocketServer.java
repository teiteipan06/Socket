import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends java.lang.Thread {

  private boolean OutServer = false;
  private ServerSocket server;
  private final int ServerPort = 8765;// 要監控的port

  public SocketServer() {
    try {
      server = new ServerSocket(ServerPort);

    } catch (java.io.IOException e) {
        System.out.println("Socket啟動有問題 !");
        System.out.println("IOException :" + e.toString());
    }
  }

    