package com.edu.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EncryptedAccount implements IAccount{

    private String encryptedName;
}
