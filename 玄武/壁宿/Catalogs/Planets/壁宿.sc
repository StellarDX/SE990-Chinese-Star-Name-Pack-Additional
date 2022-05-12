// 壁宿增二(**)
Star	"HD 221673 A"
{
	ParentBody     "HD 221673"
	Class          "K4IIIb"
  MassSol        2
  Luminosity     554
  Teff           4379
  FeH            0.06

	Orbit
	{
		Period          492.3
		Eccentricity    0.322
    Inclination     21.7
    AscendingNode   56.2
		Epoch           2416818.5
		ArgOfPericenter 113
		MeanAnomaly     0
	}
}

Star	"HD 221673 B"
{
	ParentBody     "HD 221673"
	Class          "K III"
  MassSol        2

  Orbit
	{
    Period          492.3
		Eccentricity    0.322
    Inclination     21.7
    AscendingNode   56.2
		Epoch           2416818.5
		ArgOfPericenter 293
		MeanAnomaly     0
	}
}

Star	"HD 221673 Bb(?)"
{
	ParentBody     "HD 221673 B"
	Class          "L" // ?

  Orbit
	{
    Period          4.2
	}
}

// 壁宿增三(**)
Star	"HD 222842 A"
{
	ParentBody     "HD 222842"
	Class          "K0III"
  MassSol        1.5
  RadSol         10
  Luminosity     57.35
  Teff           4898
  FeH            0.01

	Orbit
	{
		Period          630.15
		Eccentricity    0.112
    Inclination     60.64
    AscendingNode   172.55
		Epoch           2542018.67845814
		ArgOfPericenter 61.27
		MeanAnomaly     0
	}
}

Star	"HD 222842 B"
{
	ParentBody     "HD 222842"
	Class          "F1.6 V"

  Orbit
	{
    Period          630.15
		Eccentricity    0.112
    Inclination     60.64
    AscendingNode   172.55
		Epoch           2542018.67845814
		ArgOfPericenter 241.27
		MeanAnomaly     0
	}
}

// 壁宿增五(SB***)
Remove "85 Peg A"{ParentBody "85 Peg"}
Remove "85 Peg B"{ParentBody "85 Peg"}
Remove "85 Peg Ba"{ParentBody "85 Peg B"}
Remove "85 Peg Bb"{ParentBody "85 Peg B"}
Star "HD 224930 A"
{
	ParentBody "HD 224930"
	Class      "G5Vb"
	MassSol    0.88
  RadSol     0.91
  Luminosity 0.61
  Teff       5550
  FeH        -0.23657200643706271745341434230625 // 0.58 - 0.75*Solar
  Age        3.8 // 4.4

	/*BinaryOrbit
	{
		Period          26.28
		Eccentricity    0.38
		Inclination     49
		AscendingNode   290
		ArgOfPericenter 276
		Epoch           2447672.966091
		MeanAnomaly     0
	}*/
}

Barycenter "HD 224930 B"
{
	ParentBody "HD 224930"
	BinaryOrbit
	{
		Period          26.28
		Eccentricity    0.38
		Inclination     49
		AscendingNode   290
		ArgOfPericenter 96
		Epoch           2447672.966091
		MeanAnomaly     0
	}
}

Star "HD 224930 Ba"
{
	ParentBody "HD 224930 B"
	Class      "K7V"
	MassSol    0.55
  RadSol     0.67
  Luminosity 0.05
  Teff       4200

	BinaryOrbit
	{
		Separation      2
	}
}

Star "HD 224930 Bb"
{
	ParentBody "HD 224930 B"
	Class      "M"
	MassSol    0.11

  /*BinaryOrbit
	{
		Separation      2
	}*/
}

// 壁宿增六(**)
Remove "PSI Peg A"{ParentBody "PSI Peg"}
Remove "PSI Peg B"{ParentBody "PSI Peg"}
Star "HD 224427 A"
{
	ParentBody "HD 224427"
	Class      "M3III"
	RadSol     98
  Luminosity 960
  Teff       3882

	Orbit
	{
		Period          55.6
		Eccentricity    0.19
    Inclination     65.6
    AscendingNode   46.6
    Epoch           2452212.92662187
		ArgOfPericenter 339.7
		MeanAnomaly     0
	}
}

Star "HD 224427 B"
{
	ParentBody "HD 224427"
	Class      "B9.6 V" //unknown, mass corresponding around 1/3 of the system

  Orbit
	{
		Period          55.6
		Eccentricity    0.19
    Inclination     65.6
    AscendingNode   46.6
    Epoch           2452212.92662187
		ArgOfPericenter 159.7
		MeanAnomaly     0
	}
}

// 云雨增六(SB**)
Star	"HD 221950 A"
{
	ParentBody     "HD 221950"
	Class          "F6V"

	Orbit
	{
		RefPlane        "Equator"
		Period          553.829415
		Eccentricity    0.585419059
		Inclination     -2.3295126
		AscendingNode   0
		ArgOfPericenter -150.160986
		MeanAnomaly     -166.917598
	}
}

Star	"HD 221950 B"
{
	ParentBody     "HD 221950"
	Class          "K5.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          553.829415
		Eccentricity    0.585419059
		Inclination     -2.3295126
		AscendingNode   0
		ArgOfPericenter 29.839014
		MeanAnomaly     -166.917598
	}
}

// 土公增三(SB***)
Remove "UU Psc (AB)"{ParentBody "UU Psc"}
Remove "UU Psc C"{ParentBody "UU Psc"}
Remove "UU Psc A"{ParentBody "UU Psc (AB)"}
Remove "UU Psc B"{ParentBody "UU Psc (AB)"}
Barycenter "HD 1061 A"
{
	ParentBody "HD 1061"
	BinaryOrbit
	{
		Separation      894.192
	}
}

Star	"HD 1061 Aa"
{
	ParentBody     "HD 1061 A"
	Class          "F0IV"

	Orbit
	{
		PeriodDays      0.841658
		Eccentricity    0
		Inclination     19
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 1061 Ab"
{
	ParentBody     "HD 1061 A"
	Class          "F0V"

	Orbit
	{
		PeriodDays      0.841658
		Eccentricity    0
		Inclination     19
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 1061 B"
{
	ParentBody     "HD 1061"
	Class          "F"

	/*BinaryOrbit
	{
		Separation      894.192
	}*/
}

// 土公增四(**)
Star	"HD 1227 A"
{
	ParentBody     "HD 1227"
	Class          "G8II"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0608032746
		Eccentricity    0
		Inclination     1.08747625
		AscendingNode   0
		ArgOfPericenter 54.7816204
		MeanAnomaly     -137.535687
	}
}

Star	"HD 1227 B"
{
	ParentBody     "HD 1227"
	Class          "F9.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0608032746
		Eccentricity    0
		Inclination     1.08747625
		AscendingNode   0
		ArgOfPericenter 234.78162
		MeanAnomaly     -137.535687
	}
}

// 土公增七(**)
Star	"HD 2114 A"
{
	ParentBody     "HD 2114"
	Class          "G8III"
	LumBol         165
	Teff           5130
	FeH            -0.18045606445813132674103323077737 // 0.66*Solar

	Orbit
	{
		RefPlane        "Equator"
		Period          5074.25194
		Eccentricity    0.0388244316
		Inclination     1.74181378
		AscendingNode   0
		ArgOfPericenter 138.672195
		MeanAnomaly     21.9794919
	}
}

Star	"HD 2114 B"
{
	ParentBody     "HD 2114"
	Class          "A5.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          5074.25194
		Eccentricity    0.0388244316
		Inclination     1.74181378
		AscendingNode   0
		ArgOfPericenter 318.672195
		MeanAnomaly     21.9794919
	}
}

// 土公增八(**)
Star	"HD 2273 A"
{
	ParentBody     "HD 2273"
	Class          "G6IIIFe-1"
	RadSol         9.01
	Luminosity     71.5
	Teff           5286

	Orbit
	{
		RefPlane        "Equator"
		Period          1.86882994
		Eccentricity    0.787805498
		Inclination     -1.30862141
		AscendingNode   0
		ArgOfPericenter -45.9495095
		MeanAnomaly     82.9857581
	}
}

Star	"HD 2273 B"
{
	ParentBody     "HD 2273"
	Class          "F2.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1.86882994
		Eccentricity    0.787805498
		Inclination     -1.30862141
		AscendingNode   0
		ArgOfPericenter 134.05049
		MeanAnomaly     82.9857581
	}
}
