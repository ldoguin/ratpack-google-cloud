/**
 * This class is generated by jOOQ
 */
package jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_FF3670BF_DDB0_4EDE_985A_C158DD5CA9ED</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_FF3670BF_DDB0_4EDE_985A_C158DD5CA9ED = new SequenceImpl<Long>("SYSTEM_SEQUENCE_FF3670BF_DDB0_4EDE_985A_C158DD5CA9ED", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
