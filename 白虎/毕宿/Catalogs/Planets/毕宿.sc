// 毕宿增一(V**)
Remove "30 Tau A"{ParentBody "30 Tau"}
Remove "30 Tau B"{ParentBody "30 Tau"}
Star "HD 23793 A"
{
	ParentBody "HD 23793"
	Class      "B3V"
	MassSol    5.3 // 6
	RadSol     3.5 // 4
	Luminosity 900 // 1300
	Teff       16400

	Orbit
	{
		Period          25000
		Separation      1650
	}
}

Star "HD 23793 B"
{
	ParentBody "HD 23793"
	Class      "F5V"
	MassSol    1.3
	RadSol     1.7
	Luminosity 4.5
	Teff       6600

	/*Orbit
	{
		Period          25000
		Separation      1650
	}*/
}

// 毕宿增二(**)
Star "HD 24263 A"
{
	ParentBody "HD 24263"
	Class      "B5V"

	BinaryOrbit
	{
		Separation      149.026
	}
}

Star "HD 24263 B"
{
	ParentBody "HD 24263"
	Class      "G6.1 V"

	/*BinaryOrbit
	{
		Separation      149.026
	}*/
}

// 毕宿增四(**)
Star "HD 25558 A"
{
	ParentBody "HD 25558"
	Class      "B5V"

	BinaryOrbit
	{
		Separation      149.026
	}
}

Star "HD 25558 B"
{
	ParentBody "HD 25558"
	Class      "A1.6 V"

	/*BinaryOrbit
	{
		Separation      149.026
	}*/
}

// 毕宿增六(**)
Star	"HD 26690 A"
{
	ParentBody     "HD 26690"
	Class          "F2V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0073028735
		Eccentricity    0
		Inclination     -0.408905029
		AscendingNode   0
		ArgOfPericenter 154.345579
		MeanAnomaly     -95.0794074
	}
}

Star	"HD 26690 B"
{
	ParentBody     "HD 26690"
	Class          "F5.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0073028735
		Eccentricity    0
		Inclination     -0.408905029
		AscendingNode   0
		ArgOfPericenter 334.345579
		MeanAnomaly     -95.0794074
	}
}

// 毕宿增八(**)
Star	"HD 26722 A"
{
	ParentBody     "HD 26722"
	Class          "G5III"
	RadSol         12.9
	Teff           5117
	FeH            -0.1

	Orbit
	{
		Period          479
		Eccentricity    0.91
		Inclination     128.6
		AscendingNode   52.9
		Epoch           2384559.11414166
		ArgOfPericenter 83
		MeanAnomaly     0
	}
}

Star	"HD 26722 B"
{
	ParentBody     "HD 26722"
	Class          "A7V"

	Orbit
	{
		Period          479
		Eccentricity    0.91
		Inclination     128.6
		AscendingNode   52.9
		Epoch           2384559.11414166
		ArgOfPericenter 263
		MeanAnomaly     0
	}
}

// 毕宿增十一(SB**)
Star	"HD 27749 A"
{
	ParentBody     "HD 27749"
	Class          "A1m"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0321677514
		Eccentricity    0.0717707574
		Inclination     -1.35023403
		AscendingNode   0
		ArgOfPericenter 13.5612611
		MeanAnomaly     -159.692952
	}
}

Star	"HD 27749 B"
{
	ParentBody     "HD 27749"
	Class          "A2.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0321677514
		Eccentricity    0.0717707574
		Inclination     -1.35023403
		AscendingNode   0
		ArgOfPericenter 193.561261
		MeanAnomaly     -159.692952
	}
}

// 毕宿增十三(dS**)
Remove "TET2 Tau A"{ParentBody "TET2 Tau"}
Remove "TET2 Tau B"{ParentBody "TET2 Tau"}
Star "HIP 20894 A"
{
	ParentBody "HIP 20894"
	Class      "A7III"
	MassSol    2.86
	RadSol     4.4
	Luminosity 59
	Teff       7800

	Orbit
	{
		PeriodDays      140.7302
		Eccentricity    0.736
		Inclination     47.8
		AscendingNode   353.82
		ArgOfPericenter 55.41
		MeanAnomaly     0
		//SemiAmplitude   32.95
	}
}

Star "HIP 20894 B"
{
	ParentBody "HIP 20894"
	Class      ""
	MassSol    2.16
	RadSol     2.7
	Luminosity 21
	Teff       7800
	Age        0.65

	Orbit
	{
		PeriodDays      140.7302
		Eccentricity    0.736
		Inclination     47.8
		AscendingNode   353.82
		ArgOfPericenter 235.41
		MeanAnomaly     0
		//SemiAmplitude   43.68
	}
}

// 毕宿增十五 - 毕宿增十六(dS***)
Barycenter "毕宿增十五/NSV 1627/BD+15 637/GJ 170.1/9157/HD 28527/HIP 21029/HR 1427/SAO 93975"
{
	ParentBody "CCDM J04306+1611"
	BinaryOrbit
	{
		Separation      11350
		ArgOfPericenter 308
		MeanAnomaly     0
	}
}

Star "HD 28527 A"
{
	ParentBody "HD 28527"
	Class      "A6IV"
	MassSol    1.75
	RadSol     2.209
	Luminosity 19.03
	Teff       8274
	FeH        0.3
	RotationPeriod 30.672
	Age        0.307

	BinaryOrbit
	{
		Separation      0.904324
	}
}

Star "HD 28527 B"
{
	ParentBody "HD 28527"
	Class      "A6IV"

	/*BinaryOrbit
	{
		Separation      0.904324
	}*/
}

Star "毕宿增十六/PAT 11/HIP 21053/SAO 93981/HD 28568/WDS J04306+1612B"
{
	ParentBody "CCDM J04306+1611"
	Class      "F5V"

	/*BinaryOrbit
	{
		Separation      11350
	}*/
}

// 附耳增一(SB**)
Star "HD 29479 A"
{
	ParentBody "HD 29479"
	Class      "A4m"
	MassSol    1.94
	Luminosity 14.7
	Teff       8470

	Orbit
	{
		PeriodDays      38.951
		Eccentricity    0.15
		AscendingNode   82
		Epoch           2443094.319
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   7.9
	}
}

Star "HD 29479 B"
{
	ParentBody "HD 29479"
	Class      "F6 V"

	Orbit
	{
		PeriodDays      38.951
		Eccentricity    0.15
		AscendingNode   82
		Epoch           2443094.319
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 附耳增二(**)
Star	"HD 29375 A"
{
	ParentBody     "HD 29375"
	Class          "F0V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.663033643
		Eccentricity    0.731025815
		Inclination     0.526658177
		AscendingNode   0
		ArgOfPericenter 113.639794
		MeanAnomaly     44.6954709
	}
}

Star	"HD 29375 B"
{
	ParentBody     "HD 29375"
	Class          "F8.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.663033643
		Eccentricity    0.731025815
		Inclination     0.526658177
		AscendingNode   0
		ArgOfPericenter -66.3602059
		MeanAnomaly     44.6954709
	}
}

// 诸王增四(**)
// B可能是光学伴星
Star	"HD 38751 Aa"
{
	ParentBody     "HD 38751"
	Class          "G9III"
	Teff           4853
	FeH            0.18

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0629765427
		Eccentricity    0
		Inclination     1.44653702
		AscendingNode   0
		ArgOfPericenter 36.4096566
		MeanAnomaly     145.563119
	}
}

Star	"HD 38751 Ab"
{
	ParentBody     "HD 38751"
	Class          "B9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0629765427
		Eccentricity    0
		Inclination     1.44653702
		AscendingNode   0
		ArgOfPericenter -143.590343
		MeanAnomaly     145.563119
	}
}

// 五车增一(PM**)
Star	"HD 29722 A"
{
	ParentBody     "HD 29722"
	Class          "A1Vn"
	MassSol        2.58
	RadSol         2.5
	Luminosity     41.4
	Teff           10734
	Age            0.198

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00267215004
		Eccentricity    0
		Inclination     0.181447506
		AscendingNode   0
		ArgOfPericenter 2.25446382
		MeanAnomaly     -133.809683
	}
}

Star	"HD 29722 B"
{
	ParentBody     "HD 29722"
	Class          "M6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00267215004
		Eccentricity    0
		Inclination     0.181447506
		AscendingNode   0
		ArgOfPericenter 182.254464
		MeanAnomaly     -133.809683
	}
}

// 五车增二(**)
// B是光学伴星
Barycenter	"57 Per A/BD+42 990/HD 28704/HIP 21242/SAO 39604"
{
	ParentBody     "57 Per"
	Orbit
	{
		RefPlane        "Static"
	}
}

Star	"57 Per Aa"
{
	ParentBody     "57 Per A"
	Class          "F0V"
	MassSol        1.28
	Luminosity     7.88
	Teff           6615
	FeH            -0.19
	Age            1.614

	Orbit
	{
		RefPlane        "Equator"
		Period          9.92198016
		Eccentricity    0.44564113
		Inclination     1.18846464
		AscendingNode   0
		ArgOfPericenter 107.036497
		MeanAnomaly     -95.7974785
	}
}

Star	"57 Per Ab"
{
	ParentBody     "57 Per A"
	Class          "F7.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          9.92198016
		Eccentricity    0.44564113
		Inclination     1.18846464
		AscendingNode   0
		ArgOfPericenter 287.036497
		MeanAnomaly     -95.7974785
	}
}

// 五车增三(SB***)
Star	"HD 29094"
{
	ParentBody     "HIP 21476"
	Class          "K1II"
	MassSol        6.8
	RadSol         56
	Luminosity     1698
	Teff           5173
	FeH            -0.2
	Age            0.0501

	/*BinaryOrbit
	{
		Period          28.8
		Eccentricity    0.64
		Inclination     81
		AscendingNode   237
		Epoch           2443746.61245413
		ArgOfPericenter 11
		MeanAnomaly     0
	}*/
}

Barycenter	"HD 29095"
{
	ParentBody     "HIP 21476"
	BinaryOrbit
	{
		Period          28.8
		Eccentricity    0.64
		Inclination     81
		AscendingNode   237
		Epoch           2443746.61245413
		ArgOfPericenter 191
		MeanAnomaly     0
	}
}

Star	"HD 29095 A"
{
	ParentBody     "HD 29095"
	Class          "B7V"
	MassSol        3.3

	Orbit
	{
		RefPlane        "Equator"
		Period          0.219572176
		Eccentricity    0.41210565
		Inclination     -1.90175438
		AscendingNode   0
		ArgOfPericenter 20.8928059
		MeanAnomaly     95.911648
	}
}

Star	"HD 29095 B"
{
	ParentBody     "HD 29095"
	Class          ""
	MassSol        1.2

	Orbit
	{
		RefPlane        "Equator"
		Period          0.219572176
		Eccentricity    0.41210565
		Inclination     -1.90175438
		AscendingNode   0
		ArgOfPericenter 200.892806
		MeanAnomaly     95.911648
	}
}

// 五车增五(***)
Barycenter	"HD 31761 A"
{
	ParentBody     "HD 31761"
	BinaryOrbit
	{
		Period          1598.04
		Eccentricity    0.536
		Inclination     56.1
		AscendingNode   155.4
		Epoch           2905441.97108921
		ArgOfPericenter 153.4
		MeanAnomaly     0
	}
}

Star	"HD 31761 Aa"
{
	ParentBody     "HD 31761 A"
	Class          "F5V"
	MassSol        1.48 // 1.7
	Luminosity     12.46
	Teff           6603
	FeH            -0.02
	Age            2.205

	Orbit
	{
		Period          8.08
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 31761 Ab"
{
	ParentBody     "HD 31761 A"
	Class          ""
	MassSol        1.5

	Orbit
	{
		Period          8.08
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 31761 B"
{
	ParentBody     "HD 31761"
	Class          ""
	MassSol        0.82

	/* BinaryOrbit
	{
		Period          1598.04
		Eccentricity    0.536
		Inclination     56.1
		AscendingNode   155.4
		Epoch           2905441.97108921
		ArgOfPericenter 333.4
		MeanAnomaly     0
	} */
}

// 五车增六(PM**)
Remove "OME Aur A"{ParentBody "OME Aur"}
Remove "OME Aur B"{ParentBody "OME Aur"}
Star "HD 31647 A"
{
	ParentBody "HD 31647"
	Class      "A1V"
	MassSol    2.29
	RadSol     2
	Luminosity 27
	Teff       9230
	FeH        -0.12
	Age        0.317

	BinaryOrbit
	{
		Separation      243.53
	}
}

Star "HD 31647 B"
{
	ParentBody "HD 31647"
	Class      "F9"

	/*BinaryOrbit
	{
		Separation      243.53
	}*/
}

// 五车增七(PM**)
Star	"HD 30504 A"
{
	ParentBody     "HD 30504"
	Class          "K3.5IIIBa0.2"
	MassSol        1.49
	RadSol         44
	Luminosity     561
	Teff           4102
	FeH            -0.3
	Age            3.93

	Orbit
	{
		RefPlane        "Equator"
		Period          0.879581767
		Eccentricity    0
		Inclination     -1.51916265
		AscendingNode   0
		ArgOfPericenter 13.0717007
		MeanAnomaly     -101.925553
	}
}

Star	"HD 30504 B"
{
	ParentBody     "HD 30504"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.879581767
		Eccentricity    0
		Inclination     -1.51916265
		AscendingNode   0
		ArgOfPericenter 193.071701
		MeanAnomaly     -101.925553
	}
}

// 五车增八(**)
Star	"HD 30834 A"
{
	ParentBody     "HD 30834"
	Class          "K3IIIBa0.4"
	MassSol        2.86
	RadSol         48.14
	Luminosity     599
	Teff           4115
	FeH            -0.24
	Age            1.8

	Orbit
	{
		RefPlane        "Equator"
		Period          0.208420593
		Eccentricity    0
		Inclination     1.40326405
		AscendingNode   0
		ArgOfPericenter 28.9660547
		MeanAnomaly     51.5454823
	}
}

Star	"HD 30834 B"
{
	ParentBody     "HD 30834"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.208420593
		Eccentricity    0
		Inclination     1.40326405
		AscendingNode   0
		ArgOfPericenter 208.966055
		MeanAnomaly     51.5454823
	}
}

// 五车增九(SB**)
Star	"HD 41357 A"
{
	ParentBody     "HD 41357"
	Class          "A4m"
	Teff           7838
	FeH            0.35

	Orbit
	{
		PeriodDays      28.28
		Eccentricity    0.56
		Epoch           2420468.197
		ArgOfPericenter 358.4
		MeanAnomaly     0
		//SemiAmplitude   51.4
	}
}

Star	"HD 41357 B"
{
	ParentBody     "HD 41357"
	Class          "A5 V"

	Orbit
	{
		PeriodDays      28.28
		Eccentricity    0.56
		Epoch           2420468.197
		ArgOfPericenter 178.4
		MeanAnomaly     0
		//SemiAmplitude   62.5
	}
}

// 五车增十(PM**)
Star "HD 40801 A"
{
	ParentBody "HD 40801"
	Class      "K0III"
	MassSol    1.59
	RadSol     7
	Luminosity 18.47
	Teff       4834
	FeH        -0.17
	Age        3.6

	BinaryOrbit
	{
		Separation      12160
	}
}

Star "HD 40801 B"
{
	ParentBody "HD 40801"
	Class      "M5.3"

	/*BinaryOrbit
	{
		Separation      12160
	}*/
}

// 五车增十四(**)
Star "41 Aur A/GC 7853/HD 42127/HR 2176/SAO 40925"
{
	ParentBody "WDS J06116+4843"
	Class      "A2Va+"
	Teff       9000

	BinaryOrbit
	{
		Epoch           2455927.43978347
		Separation      701.311
		PositionAngle   357.7
	}
}

Star "41 Aur B/GC 7851/HD 42126/HR 2175/SAO 40924"
{
	ParentBody "WDS J06116+4843"
	Class      "kA5hA5mF0(IV-V)"
	MassSol    1.99
	RadSol     1.78
	Luminosity 11.2
	Teff       7925

	/*BinaryOrbit
	{
		Epoch           2455927.43978347
		Separation      701.311
		PositionAngle   357.7
	}*/
}

// 五车增十七(**)
Star	"HD 38104 A"
{
	ParentBody     "HD 38104"
	Class          "A1CrEu"
	Luminosity     95
	Teff           8660

	Orbit
	{
		RefPlane        "Equator"
		Period          7.1935528
		Eccentricity    0.539153159
		Inclination     -0.475928307
		AscendingNode   0
		ArgOfPericenter -26.8197498
		MeanAnomaly     160.917408
	}
}

Star	"HD 38104 B"
{
	ParentBody     "HD 38104"
	Class          "A2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7.1935528
		Eccentricity    0.539153159
		Inclination     -0.475928307
		AscendingNode   0
		ArgOfPericenter 153.18025
		MeanAnomaly     160.917408
	}
}

// 天潢增一(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=24727
Barycenter	"HD 34334 A"
{
	ParentBody     "HD 34334"
	BinaryOrbit
	{
		Period          4369
		Separation      299.62
	}
}

Star	"HD 34334 Aa"
{
	ParentBody     "HD 34334 A"
	Class          "K2.5IIIbCN-0.5"
	MassSol        1.3
	RadSol         18.8
	Luminosity     112
	Teff           4264
	FeH            -0.4
	Age            5.07

	Orbit
	{
		Period          434.16
		Eccentricity    0.1189
		Inclination     52.93
		AscendingNode   56.2
		Epoch           2448348.1172
		ArgOfPericenter 250.1
		MeanAnomaly     0
	}
}

Star	"HD 34334 Ab"
{
	ParentBody     "HD 34334 A"
	Class          ""
	MassSol        1.37

	Orbit
	{
		Period          434.16
		Eccentricity    0.1189
		Inclination     52.93
		AscendingNode   56.2
		Epoch           2448348.1172
		ArgOfPericenter 70.1
		MeanAnomaly     0
	}
}

Star	"HD 34334 B"
{
	ParentBody     "HD 34334"
	Class          ""
	MassSol        0.96

	/*BinaryOrbit
	{
		Period          4369
		Separation      299.62
	}*/
}

// 天潢增二(EB***)
Barycenter	"HD 34364 A"
{
	ParentBody     "HD 34364"
	BinaryOrbit
	{
		Period          23.7
		Separation      13
	}
}

Star	"HD 34364 Aa"
{
	ParentBody     "HD 34364 A"
	Class          "B9V"
	MassSol        2.552
	Teff           10590

	Orbit
	{
		PeriodDays      4.13 // 光变周期
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 34364 Ab"
{
	ParentBody     "HD 34364 A"
	Class          ""
	MassSol        2.367
	Teff           10350

	Orbit
	{
		PeriodDays      4.13
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 34364 B"
{
	ParentBody     "HD 34364"
	Class          ""
	MassSol        0.54

	/*BinaryOrbit
	{
		Period          23.7
		Separation      13
	}*/
}

// 天关增二(**)
Star	"HD 37711 A"
{
	ParentBody     "HD 37711"
	Class          "B3IV"
	MassSol        6.31
	Luminosity     2061
	Teff           17900

	Orbit
	{
		Period          111.02
		Eccentricity    0.661
		Inclination     80.5
		AscendingNode   53.2
		Epoch           2428946.99855952
		ArgOfPericenter 220.9
		MeanAnomaly     0
	}
}

Star	"HD 37711 B"
{
	ParentBody     "HD 37711"
	Class          "A3 V"

	Orbit
	{
		Period          111.02
		Eccentricity    0.661
		Inclination     80.5
		AscendingNode   53.2
		Epoch           2428946.99855952
		ArgOfPericenter 40.9
		MeanAnomaly     0
	}
}

// 天关增六(**)
Star	"HD 37940 A"
{
	ParentBody     "HD 37940"
	Class          "B9"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.711424023
		Eccentricity    0.427064329
		Inclination     0.532700062
		AscendingNode   0
		ArgOfPericenter -40.2064208
		MeanAnomaly     -174.79632
	}
}

Star	"HD 37940 B"
{
	ParentBody     "HD 37940"
	Class          "A9.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.711424023
		Eccentricity    0.427064329
		Inclination     0.532700062
		AscendingNode   0
		ArgOfPericenter 139.793579
		MeanAnomaly     -174.79632
	}
}

// 九州殊口增二(**)
Star "32 Eri A/SAO 130806/HD 24555/HR 1212"
{
	ParentBody "ADS 2850 AB"
	Class      "G6.5III"

	BinaryOrbit
	{
		Separation      659.314
	}
}

Star "32 Eri B/SAO 130805/HD 24554"
{
	ParentBody "ADS 2850 AB"
	Class      "A1V"

	/*BinaryOrbit
	{
		Separation      659.314
	}*/
}

// 九州殊口增四(**)
Star "HD 24388 A"
{
	ParentBody "HD 24388"
	Class      "B8III"

	BinaryOrbit
	{
		Separation      960.15
	}
}

Star "HD 24388 B"
{
	ParentBody "HD 24388"
	Class      "F4V"

	/*BinaryOrbit
	{
		Separation      960.15
	}*/
}

// 九州殊口增七(***Pl)
Remove "Keid A"{ParentBody "Keid"}
Remove "Keid (BC)"{ParentBody "Keid"}
Remove "Keid B"{ParentBody "Keid (BC)"}
Remove "Keid C"{ParentBody "Keid (BC)"}
Star	"OMI2 Eri A/Keid/HD 26965/HIP 19849/HR 1325/LHS 23/LTT 1907/SAO 131063/BD-07 780"
{
	ParentBody  "CCDM J04153-0739"
	Class       "K0.5V"
	MassSol     0.84
	RadSol      0.81
	Luminosity  0.457
	Teff        5300
	FeH         -0.19
	RotationPeriod 888 // 37 - 43 d

	/*BinaryOrbit
	{
		Period          8000
		Separation      400
	}*/
}

Barycenter	"OMI2 Eri BC"
{
	ParentBody  "CCDM J04153-0739"
	BinaryOrbit
	{
		Period          8000
		Separation      400
	}
}

Star	"OMI2 Eri B/BD-07 781/G 160-060/HD 26976/LHS 24/LTT 1908/SAO 131065"
{
	ParentBody  "OMI2 Eri BC"
	Class       "DA4"
	MassSol     0.573
	RadSol      0.014
	Luminosity  0.013
	Teff        16500

	Orbit
	{
		Period          230.3
		Eccentricity    0.4294
		Inclination     107.56
		AscendingNode   151.44
		Epoch           2395918.14652375
		ArgOfPericenter 138.4
		MeanAnomaly     0
	}
}

Star	"OMI2 Eri C/DY Eri/BD-07 781 C/LHS 25/LTT 1909"
{
	ParentBody  "OMI2 Eri BC"
	Class       "M4.5eV"
	MassSol     0.2036
	RadSol      0.31
	Luminosity  0.008
	Teff        3100
	Age         5.6

	Orbit
	{
		Period          230.3
		Eccentricity    0.4294
		Inclination     107.56
		AscendingNode   151.44
		Epoch           2395918.14652375
		ArgOfPericenter 318.4
		MeanAnomaly     0
	}
}

//////////ExoPlanets///////////
Remove "HD 26965 b"{ParentBody "HD 26965"}
Planet	"HD 26965 b"
{
	ParentBody     "Keid"
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Class          "Terra"// Super-Earth
	Mass           8.47

	Orbit
	{
		SemiMajorAxis   0.22446
		PeriodDays      42.378
		Eccentricity    0.04
	}
}

// 九州殊口增十(***Pl)
Star	"51 Eri A"
{
	ParentBody  "51 Eri"
	Class       "F0V"
	MassSol     1.75
	RadSol      1.45
	Luminosity  6.7
	Teff        7331
	FeH         -0.12

	/*BinaryOrbit
	{
		Separation      2000
	}*/
}

Barycenter	"GJ 3305"
{
	ParentBody  "51 Eri"
	BinaryOrbit
	{
		Separation      2000
	}
}

Star	"GJ 3305 A"
{
	ParentBody  "GJ 3305"
	Class       ""
	MassSol     0.67

	BinaryOrbit
	{
		Separation      9.78
		Eccentricity    0.19
	}
}

Star	"GJ 3305 B"
{
	ParentBody  "GJ 3305"
	Class       ""
	MassSol     0.44

	/*BinaryOrbit
	{
		Separation      9.78
		Eccentricity    0.19
	}*/
}

//////////ExoPlanets///////////
Remove "51 Eri b"{ParentBody "51 Eri"}
Planet	"51 Eri b"
{
	ParentBody     "51 Eri A"
	DiscMethod     "Imaging"
	DiscDate       "2014" // Macintosh et al., 2014.12
	Radius         79356.12
	Mass           826.353788
	Teff           700

	Orbit
	{
		SemiMajorAxis   11.1
		Eccentricity    0.49
		PeriodDays      10260
		Inclination     136
		Epoch           2452014.79
		ArgOfPericenter 84
		MeanAnomaly     0
	}
}

// 参旗增五(**)
Star "HD 33276 A"
{
	ParentBody "HD 33276"
	Class      "F2IV"
	MassSol    3.42
	RadSol     5.9
	Luminosity 300
	Teff       7161
	FeH        0.21

	BinaryOrbit
	{
		Separation      31.5002
	}
}

Star "HD 33276 B"
{
	ParentBody "HD 33276"
	Class      "K7.3 V"

	/*BinaryOrbit
	{
		Separation      31.5002
	}*/
}

// 参旗增七(SB**)
Star	"HD 33254 A"
{
	ParentBody     "HD 33254"
	Class          "A2m"
	RadSol         2.75
	Luminosity     16.67
	Teff           7120

	Orbit
	{
		RefPlane        "Equator"
		Period          749.279861
		Eccentricity    0.261373699
		Inclination     -0.4929142
		AscendingNode   0
		ArgOfPericenter 142.587673
		MeanAnomaly     142.396334
	}
}

Star	"HD 33254 B"
{
	ParentBody     "HD 33254"
	Class          "F3.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          749.279861
		Eccentricity    0.261373699
		Inclination     -0.4929142
		AscendingNode   0
		ArgOfPericenter 322.587673
		MeanAnomaly     142.396334
	}
}

// 参旗增十(*****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=23879%20
Barycenter "参旗增十/14 Ori AB/STT 98/HIP 23879/SAO 112440/HD 33054/HR 1664/WDS J05079+0830"
{
	ParentBody "14 Ori"
	BinaryOrbit
	{
		Separation      20514.3
		Period          1046000
	}
}

// PQ = ADS 9712 = HD 33055, 2000: 05.0755 +08.2411, not in HIPPARCOS!
Barycenter "14 Ori PQ/HD 33055"
{
	ParentBody "14 Ori"
	/*BinaryOrbit
	{
		Separation      20514.3
		Period          1046000
	}*/
}

// AB: orbit Gr.2, dyn.plx=19.9mas, matches Gaia plx(P), while HIP1 plx(A)=16.8mas
Barycenter "HD 33054 A"
{
	ParentBody "HD 33054"
	Orbit // VB6_Sca2008d STT_98 Gr.2
	{
		Period          197.45
		Epoch           2443045.34743247
		Eccentricity    0.175
		AscendingNode   88.3
		ArgOfPericenter 62.8
		Inclination     142.8
		MeanAnomaly     0
	}
}

Star	"HD 33054 B"
{
	ParentBody     "HD 33054"
	Class          ""
	MassSol        1.42

	Orbit
	{
		Period          197.45
		Epoch           2443045.34743247
		Eccentricity    0.175
		AscendingNode   88.3
		ArgOfPericenter 242.8
		Inclination     142.8
		MeanAnomaly     0
	}
}

Star	"HD 33054 Aa"
{
	ParentBody     "HD 33054 A"
	Class          "Am"
	MassSol        1.9

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.158620093
		Eccentricity    0.196281552
		Inclination     -1.20308137
		AscendingNode   0
		ArgOfPericenter 12.0431023
		MeanAnomaly     -11.9610777
	}
}

// DR2 plx(A) is likely biased.
Star	"HD 33054 Ab"
{
	ParentBody     "HD 33054 A"
	Class          "F3.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.158620093
		Eccentricity    0.196281552
		Inclination     -1.20308137
		AscendingNode   0
		ArgOfPericenter 192.043102
		MeanAnomaly     -11.9610777
	}
}

// Gaia: PM(P)=(23.0,-60,6), PM(Q)=(18.2,-60.8), plx. 18.91 & 18.67 mas
Star	"HD 33055 A"
{
	ParentBody     "HD 33055"
	Class          "K2"
	MassSol        0.85

	BinaryOrbit
	{
		Period          1078
	}
}

Star	"HD 33055 B"
{
	ParentBody     "HD 33055"
	Class          ""
	MassSol        0.85

	/*BinaryOrbit
	{
		Period          1078
	}*/
}

// 九斿增三(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=22958%20
Barycenter	"HD 31512 A"
{
	ParentBody     "HD 31512"
	BinaryOrbit
	{
		Period          652977
		Separation      15127.1
	}
}

Star	"HD 31512 Aa"
{
	ParentBody     "HD 31512 A"
	Class          "B5III"
	MassSol        6.18
	RadSol         3.67
	Luminosity     574.89
	Teff           12367

	BinaryOrbit
	{
		Period          626.561
	}
}

Star	"HD 31512 Ab"
{
	ParentBody     "HD 31512 A"
	Class          ""
	MassSol        1.52

	/*BinaryOrbit
	{
		Period          626.561
	}*/
}

Star	"HD 31512 B"
{
	ParentBody     "HD 31512"
	Class          "B8"
	MassSol        1.78

	/*BinaryOrbit
	{
		Period          652977
		Separation      15127.1
	}*/
}

// 九斿增四(**)
Star	"HD 29503 A"
{
	ParentBody     "HD 29503"
	Class          "K1III"
	MassSol        1.07
	RadSol         9.8
	Luminosity     37
	Teff           4603
	FeH            -0.11

	Orbit
	{
		Period          77.4
		Eccentricity    0.666
		Inclination     59.8
		AscendingNode   171.25
		Epoch           2443059.95712042
		ArgOfPericenter 203.5
		MeanAnomaly     0
	}
}

Star	"HD 29503 B"
{
	ParentBody     "HD 29503"
	Class          ""
	MassSol        1.42

	Orbit
	{
		Period          77.4
		Eccentricity    0.666
		Inclination     59.8
		AscendingNode   171.25
		Epoch           2443059.95712042
		ArgOfPericenter 23.5
		MeanAnomaly     0
	}
}

// 天园增四(**)
Star	"HD 22663 A"
{
	ParentBody     "HD 22663"
	Class          "K1 III"
	MassSol         1.43
	RadSol          13.01
	Luminosity      95.5
	Teff            4660
	FeH             -0.15
	Age             2.58

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0358561298
		Eccentricity    0
		Inclination     1.05542123
		AscendingNode   0
		ArgOfPericenter -33.4860434
		MeanAnomaly     148.710894
	}
}

Star	"HD 22663 B"
{
	ParentBody     "HD 22663"
	Class          "A8.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0358561298
		Eccentricity    0
		Inclination     1.05542123
		AscendingNode   0
		ArgOfPericenter 146.513957
		MeanAnomaly     148.710894
	}
}
