package ua.dborisenko.astergazer.model.block;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RemoveQueueMember")
public class RemoveQueueMemberBlock extends Block {

    public RemoveQueueMemberBlock() {
        application = "RemoveQueueMember";
        parametersCount = 2;
    }
}
