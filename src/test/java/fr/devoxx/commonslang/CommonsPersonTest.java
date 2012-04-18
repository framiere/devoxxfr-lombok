package fr.devoxx.commonslang;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class CommonsPersonTest {
    @Test
    public void god() {
        CommonsPerson god = newGod();
        assertThat(god.getFirstname()).isEqualTo("Chuck");
        assertThat(god.getName()).isEqualTo("Norris");
        assertThat(god.getAge()).isEqualTo(72);
        assertThat(god.toString()) //
                .contains(CommonsPerson.class.getSimpleName()) //
                .endsWith("[name=Norris,firstname=Chuck,age=72]");
    }

    private CommonsPerson newGod() {
        CommonsPerson chuck = new CommonsPerson();
        chuck.setName("Norris");
        chuck.setFirstname("Chuck");
        chuck.setAge(72);
        return chuck;
    }
}