package hip.cda.hipcda.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestEntity implements Serializable {

    private String Id;
    private String key;
    private String value;
}
