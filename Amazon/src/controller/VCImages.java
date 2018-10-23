package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VCImages extends HttpServlet
{
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    int width = 70;

    int height = 50;
    BufferedImage buffImg = new BufferedImage(width, height, 
      1);
    Graphics2D g = buffImg.createGraphics();

    Random random = new Random();

    g.setColor(getRandColor(200, 250));
    g.fillRect(0, 0, width, height);

    Font font = new Font("Times New Roman", 2, 28);

    g.setFont(font);

    g.setColor(Color.BLACK);
    g.drawRect(0, 0, width - 1, height - 1);

    g.setColor(getRandColor(160, 200));
    for (int i = 0; i < 155; i++) {
      int x = random.nextInt(width);
      int y = random.nextInt(height);
      int xl = random.nextInt(12);
      int yl = random.nextInt(12);
      g.drawLine(x, y, x + xl, y + yl);
    }

    StringBuffer randomCode = new StringBuffer();

    int length = 4;

    String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    int size = base.length();

    for (int i = 0; i < length; i++)
    {
      int start = random.nextInt(size);
      String strRand = base.substring(start, start + 1);

      g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));

      g.drawString(strRand, 15 * i + 6, 24);

      randomCode.append(strRand);
    }

    HttpSession session = request.getSession();
    session.setAttribute("rand", randomCode.toString());

    g.dispose();

    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0L);

    response.setContentType("image/jpeg");

    ServletOutputStream sos = response.getOutputStream();
    ImageIO.write(buffImg, "jpeg", sos);
    sos.flush();
    sos.close();
  }

  Color getRandColor(int fc, int bc)
  {
    Random random = new Random();
    if (fc > 255)
      fc = 255;
    if (bc > 255)
      bc = 255;
    int r = fc + random.nextInt(bc - fc);
    int g = fc + random.nextInt(bc - fc);
    int b = fc + random.nextInt(bc - fc);
    return new Color(r, g, b);
  }
}