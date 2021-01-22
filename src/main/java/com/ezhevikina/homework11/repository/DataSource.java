package com.ezhevikina.homework11.repository;

import com.ezhevikina.homework11.model.Account;
import com.ezhevikina.homework11.repository.exceptions.DaoException;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class DataSource {
  private final static String DIR = "./src/main/resources/accounts";

  public void initialize(Dao<Account> dao) throws DaoException {
    File accounts = new File(DIR);

    if (!accounts.exists()) {
      accounts.mkdir();
      System.out.println("accounts dir created");

      for (int i = 1; i <= 10; i++) {
        dao.create(new Account(
            i, "HolderName" + i, 100 * i));
      }
    }
  }

  public static String getDIR() {
    return DIR;
  }
}
