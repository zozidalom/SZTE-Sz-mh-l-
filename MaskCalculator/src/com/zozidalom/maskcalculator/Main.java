package com.zozidalom.maskcalculator;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
  public static void main(String[] args) throws UnknownHostException {
    if (args.length < 2) {
      System.out.println("You did not enter enough arguments!");
      return;
    }
    InetAddress mask;
    int n;
    try {
      n = Integer.parseInt(args[1]);
    } catch (NumberFormatException ex) {
      System.out.println("The amount must be a number!");
      return;
    }
    switch (args[0]) {
      case "A": {
        mask = Inet4Address.getByName("255.0.0.0");
        break;
      }
      case "B": {
        mask = Inet4Address.getByName("255.255.0.0");
        break;
      }
      case "C": {
        mask = Inet4Address.getByName("255.255.255.0");
        break;
      }
      default: {
        System.out.println("The type must be A / B / C!");
        return;
      }
    }
    System.out.println(mask.toString());
  }
}
