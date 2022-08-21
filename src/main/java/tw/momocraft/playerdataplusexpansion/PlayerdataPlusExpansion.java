package tw.momocraft.playerdataplusexpansion;

import me.clip.placeholderapi.expansion.Configurable;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import tw.momocraft.playerdataplus.api.PlayerdataPlusAPI;

import java.util.Map;

public final class PlayerdataPlusExpansion extends PlaceholderExpansion implements Configurable {

    @Override
    public String getIdentifier() {
        return "playerdataplus";
    }

    @Override
    public String getAuthor() {
        return "momocraft";
    }

    @Override   
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, String identifier) {
        // %playerdataplus_nick_VALUE%
        if (identifier.startsWith("nick_"))
            PlayerdataPlusAPI.getPlayer().getNickName(identifier.substring(identifier.indexOf("nick_")));
        // %playerdataplus_displayname_VALUE%
        if (identifier.startsWith("displayname_"))
            PlayerdataPlusAPI.getPlayer().getDisplayName(identifier.substring(identifier.indexOf("nick_")));
        // %playerdataplus_lastlogin_VALUE%
        if (identifier.startsWith("lastlogin_"))
            PlayerdataPlusAPI.getPlayer().getLastLogin(identifier.substring(identifier.indexOf("nick_")));
        // %playerdataplus_playerdata_VALUE%
        if (identifier.startsWith("playerdata_"))
            PlayerdataPlusAPI.getPlayer().getLastLogin(identifier.substring(identifier.indexOf("nick_")));
        // return null for unknown placeholders
        return null;
    }

    @Override
    public Map<String, Object> getDefaults() {
        return null;
    }
}