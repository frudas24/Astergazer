package ua.dborisenko.astergazer.model.block;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AddQueueMember")
public class AddQueueMemberBlock extends Block {

    public AddQueueMemberBlock() {
        application = "AddQueueMember";
        parametersCount = 6;
    }
}
