import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

//WARNING This utils only work on 1.8 spigot server ! 
// If you want to make it work on other version, you need to change your import from NMS to your version

public class TagUtils {

    public static ItemStack setTag(ItemStack itemStack, String key, String value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, boolean value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, byte value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, double value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, byte[] value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, float value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, int value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, int[] value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, long value) {
        return setTagInternal(itemStack, key, value);
    }

    public static ItemStack setTag(ItemStack itemStack, String key, short value) {
        return setTagInternal(itemStack, key, value);
    }

    private static ItemStack setTagInternal(ItemStack itemStack, String key, Object value) {
        net.minecraft.server.v1_8_R3.ItemStack stack = CraftItemStack.asNMSCopy(itemStack);
        NBTTagCompound tag = stack.getTag() != null ? stack.getTag() : new NBTTagCompound();

        if (value instanceof String) {
            tag.setString(key, (String) value);
        } else if (value instanceof Boolean) {
            tag.setBoolean(key, (Boolean) value);
        } else if (value instanceof Byte) {
            tag.setByte(key, (Byte) value);
        } else if (value instanceof Double) {
            tag.setDouble(key, (Double) value);
        } else if (value instanceof byte[]) {
            tag.setByteArray(key, (byte[]) value);
        } else if (value instanceof Float) {
            tag.setFloat(key, (Float) value);
        } else if (value instanceof Integer) {
            tag.setInt(key, (Integer) value);
        } else if (value instanceof int[]) {
            tag.setIntArray(key, (int[]) value);
        } else if (value instanceof Long) {
            tag.setLong(key, (Long) value);
        } else if (value instanceof Short) {
            tag.setShort(key, (Short) value);
        }

        stack.setTag(tag);
        return CraftItemStack.asCraftMirror(stack);
    }
    
    public static String getTagString(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getString(key) : null;
    }

    public static Boolean getTagBoolean(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getBoolean(key) : null;
    }

    public static Byte getTagByte(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getByte(key) : null;
    }

    public static Double getTagDouble(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getDouble(key) : null;
    }

    public static byte[] getTagByteArray(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getByteArray(key) : null;
    }

    public static Float getTagFloat(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getFloat(key) : null;
    }

    public static Integer getTagInt(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getInt(key) : null;
    }

    public static int[] getTagIntArray(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getIntArray(key) : null;
    }

    public static Long getTagLong(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getLong(key) : null;
    }

    public static Short getTagShort(ItemStack itemStack, String key) {
        NBTTagCompound tag = getTagCompound(itemStack);
        return tag.hasKey(key) ? tag.getShort(key) : null;
    }

    private static NBTTagCompound getTagCompound(ItemStack itemStack) {
        net.minecraft.server.v1_8_R3.ItemStack stack = CraftItemStack.asNMSCopy(itemStack);
        NBTTagCompound tag = stack.getTag();
        return tag != null ? tag : new NBTTagCompound();
    }
}
