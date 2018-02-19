package us.tastybento.bskyblock.commands.island;

import java.util.List;

import us.tastybento.bskyblock.Constants;
import us.tastybento.bskyblock.api.commands.CompositeCommand;
import us.tastybento.bskyblock.api.commands.User;
import us.tastybento.bskyblock.commands.IslandCommand;

/**
 * @author Poslovitch
 */
public class IslandSettingsCommand extends CompositeCommand {

    public IslandSettingsCommand(IslandCommand islandCommand) {
        super(islandCommand, "settings", "flags");
    }

    /* (non-Javadoc)
     * @see us.tastybento.bskyblock.api.commands.CompositeCommand#setup()
     */
    @Override
    public void setup() {
        setPermission(Constants.PERMPREFIX + "island.settings");
        setOnlyPlayer(true);
        setDescription("commands.island.settings.description");
    }

    /* (non-Javadoc)
     * @see us.tastybento.bskyblock.api.commands.CommandArgument#execute(org.bukkit.command.CommandSender, java.lang.String[])
     */
    @Override
    public boolean execute(User user, List<String> args) {
        return true;
    }
}
