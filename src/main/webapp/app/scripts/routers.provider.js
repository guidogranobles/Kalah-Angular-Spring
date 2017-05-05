"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const router_1 = require("@angular/router");
const game_component_1 = require("./components/game.component");
exports.appRoutes = [
    {
        path: '',
        component: game_component_1.GameComponent
    }
];
exports.appRoutingProviders = [];
exports.routing = router_1.RouterModule.forRoot(exports.appRoutes);
//# sourceMappingURL=routers.provider.js.map