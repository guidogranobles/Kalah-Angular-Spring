"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
const core_1 = require("@angular/core");
const platform_browser_1 = require("@angular/platform-browser");
const forms_1 = require("@angular/forms");
const http_1 = require("@angular/http");
const store_1 = require("@ngrx/store");
const router_store_1 = require("@ngrx/router-store");
const routers_provider_1 = require("./routers.provider");
const gameservices_1 = require("./services/gameservices");
const app_component_1 = require("./components/app.component");
const game_component_1 = require("./components/game.component");
const index_1 = require("./reducers/index");
let AppModule = class AppModule {
};
AppModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule, forms_1.FormsModule, routers_provider_1.routing, http_1.HttpModule, store_1.StoreModule.provideStore(index_1.reducer), router_store_1.RouterStoreModule.connectRouter()],
        declarations: [app_component_1.AppComponent, game_component_1.GameComponent],
        providers: [routers_provider_1.appRoutingProviders, gameservices_1.GameServices, store_1.StoreModule],
        bootstrap: [app_component_1.AppComponent]
    })
], AppModule);
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map