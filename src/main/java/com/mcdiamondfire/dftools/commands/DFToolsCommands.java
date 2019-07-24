package com.mcdiamondfire.dftools.commands;

import com.mojang.brigadier.CommandDispatcher;
import io.github.cottonmc.clientcommands.*;

public class DFToolsCommands implements ClientCommandPlugin {
    @Override
    public void registerCommands(CommandDispatcher<CottonClientCommandSource> dispatcher) {
        CanDestroyCommand.register(dispatcher);
        CanPlaceCommand.register(dispatcher);
        DFToolsHelpCommand.register(dispatcher);
        EditNameCommand.register(dispatcher);
        ItemDataCommand.register(dispatcher);
    }
}