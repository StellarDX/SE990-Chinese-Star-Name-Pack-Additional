// Object * b Boo  ---  Spectroscopic Binary  ---  OID=@2853604   (@@48540,6)  ---  coobox=17730 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Remove "46 Boo A" {ParentBody "46 Boo"}
Remove "46 Boo B" {ParentBody "46 Boo"}
Star "46 Boo A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 74087"
	Class           "K2III"
	AbsMagn         -0.31
	RadSol          23.35
	LumBol          175.8
	Teff            4349
	FeH             -0.27

	BinaryOrbit     
	{
		PeriodDays      2567.1
		Separation      1.66913501606885 // 11.2 mas
		Eccentricity    0.8315
		Inclination     62
		AscendingNode   82.6
		Epoch           2448356.6
		ArgOfPericenter 355.3
		MeanAnomaly     0
	}
}

Star "46 Boo B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 74087"
	Class           ""
	MassSol         0.6 // 0.8
}